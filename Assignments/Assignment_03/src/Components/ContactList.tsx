import React, { useContext } from 'react';
import ContactListItem from './ContactListItem';
import { ContactsContext } from '../Context/ContactContext';

const ContactList: React.FC = () => {
  const context = useContext(ContactsContext);
  if (!context) return null;

  const { contacts, deleteContact } = context;

  return (
    <div className="contact-list">
      {contacts.map((contact, index) => (
        <ContactListItem
          key={index}
          contact={contact}
          index={index}
          deleteContact={deleteContact}
        />
      ))}
    </div>
  );
};

export default ContactList;
