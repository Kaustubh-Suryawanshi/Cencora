import React, { createContext, useState } from 'react';

export interface Contact {
  firstName: string;
  lastName: string;
  contactNumber: string;
  email: string;
  addressType: 'Home' | 'Office' |'';
  address: string;
}

interface ContactsContextProps {
  contacts: Contact[];
  addContact: (contact: Contact) => void;
  editContact: (index: number, contact: Contact) => void;
  deleteContact: (index: number) => void;
}

export const ContactsContext = createContext<ContactsContextProps | undefined>(undefined);

export const ContactsProvider: React.FC<{ children: React.ReactNode }> = ({ children }) => {
  const [contacts, setContacts] = useState<Contact[]>([]);

  const addContact = (contact: Contact) => {
    setContacts((prevContacts) => [...prevContacts, contact]);
  };

  const editContact = (index: number, updatedContact: Contact) => {
    setContacts((prevContacts) => {
      const newContacts = [...prevContacts];
      newContacts[index] = updatedContact;
      return newContacts;
    });
  };

  const deleteContact = (index: number) => {
    setContacts((prevContacts) => prevContacts.filter((_, i) => i !== index));
  };

  return (
    <ContactsContext.Provider value={{ contacts, addContact, editContact, deleteContact }}>
      {children}
    </ContactsContext.Provider>
  );
};
