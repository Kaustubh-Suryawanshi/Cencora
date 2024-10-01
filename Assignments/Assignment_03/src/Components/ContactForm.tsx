import React, { useState, useEffect, useContext, useCallback } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { ContactsContext, Contact } from "../Context/ContactContext";

const ContactForm: React.FC = () => {
  const { index } = useParams<{ index: string }>();
  const navigate = useNavigate();
  const context = useContext(ContactsContext);
  if (!context) return null;

  const { contacts, addContact, editContact } = context;
  const existingContact = index !== undefined ? contacts[parseInt(index, 10)] : undefined;

  const [initialContact, setInitialContact] = useState<Contact | null>(null);
  const [contact, setContact] = useState<Contact>({
    firstName: "",
    lastName: "",
    contactNumber: "",
    email: "",
    addressType: "",
    address: "",
  });

  useEffect(() => {
    if (existingContact) {
      setContact(existingContact);
      setInitialContact(existingContact);
    }
  }, [existingContact]);

  const validate = () => {
    return (
      contact.firstName &&
      contact.lastName &&
      /^[0-9]{10}$/.test(contact.contactNumber) &&
      /@/.test(contact.email)
      && contact.addressType && contact.address
    )

  };

  const handleChange = (
    e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement>
  ) => {
    const { name, value } = e.target;
    setContact((prevContact) => ({ ...prevContact, [name]: value }));
  };

  const handleNameInput = (e: React.FormEvent<HTMLInputElement>) => {
    const input = e.currentTarget;
    input.value = input.value.replace(/[^a-zA-Z]/g, '');
    handleChange(e as React.ChangeEvent<HTMLInputElement>);
  };

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();

    if (existingContact) {
      editContact(parseInt(index!, 10), contact);
    } else {
      addContact(contact);
    }

    navigate('/');
  };

  const hasChanges = useCallback(() => {
    if (!initialContact) return true;
    return (
      contact.firstName !== initialContact.firstName ||
      contact.lastName !== initialContact.lastName ||
      contact.contactNumber !== initialContact.contactNumber ||
      contact.email !== initialContact.email ||
      contact.addressType !== initialContact.addressType ||
      contact.address !== initialContact.address
    );
  }, [contact, initialContact]);

  return (
  <>
  <center><h1>Contact Details</h1></center>
    <form className="contact-form" onSubmit={handleSubmit}>
      <div>
      <label>
        First Name:
        <input
          type="text"
          name="firstName"
          value={contact.firstName}
          onChange={handleChange}
          onInput={handleNameInput}
        />
      </label>
      </div>
      
      <div>
      <label>
        Last Name:
        <input
          type="text"
          name="lastName"
          value={contact.lastName}
          onChange={handleChange}
          onInput={handleNameInput}
        />
      </label>
      </div>
     <div>
      <label>
        Contact Number:
        <input
          type="number"
          name="contactNumber"
          value={contact.contactNumber}
          onChange={handleChange}
          maxLength={10}
        />
        
      </label></div>
      <div>
      <label>
        Email:
        <input
          type="email"
          name="email"
          value={contact.email}
          onChange={handleChange}
        />
        
      </label>
      </div>
      <div>
      <label>
        Address Type:
        <div className="radio-group" >
          <label>
            <input
              type="radio"
              name="addressType"
              value="Home"
              checked={contact.addressType === 'Home'}
              onChange={handleChange}

              
            />
            Home
          </label>
          <label>
            <input
              type="radio"
              name="addressType"
              value="Office"
              checked={contact.addressType === 'Office'}
              onChange={handleChange}
            />
            Office
          </label>
        </div>
      </label>
      </div>
      {contact.addressType && (
        <label>
          Address:
          <textarea
            name="address"
            value={contact.address}
            onChange={handleChange}
          ></textarea>
        </label>
      )}
      
      <button type="submit" disabled={!validate() || !hasChanges()} >
        Submit
      </button>
      <button type="button" onClick={() => navigate("/")}>
        Back
      </button>
    </form>
    </>
  );
};

export default ContactForm;
