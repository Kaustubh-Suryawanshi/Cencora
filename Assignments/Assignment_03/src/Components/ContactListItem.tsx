import React from 'react';
import { Link } from 'react-router-dom';
import { Contact } from '../Context/ContactContext';

interface Props {
  contact: Contact;
  index: number;
  deleteContact: (index: number) => void;
}

const ContactListItem: React.FC<Props> = ({ contact, index, deleteContact }) => {
  
  const handleDelete = () => {
    if (window.confirm('Are you sure you want to delete this contact?')) {
      deleteContact(index);
      alert('Contact deleted');
    }
  };

  return (
    <div className="contact-list-item">
      <div>
        <strong>{contact.firstName} {contact.lastName}</strong>
        <p>{contact.contactNumber}</p>
        <p>{contact.email}</p>
        <strong><p>{contact.addressType} address</p></strong>
        <p>{contact.address}</p>
      </div>
      <div className="actions">
        <Link to={`/contact/${index}`}>
          <button>Edit</button>
        </Link>
        <button onClick={handleDelete}>Delete</button>
      </div>
    </div>
  );
};

export default ContactListItem;
