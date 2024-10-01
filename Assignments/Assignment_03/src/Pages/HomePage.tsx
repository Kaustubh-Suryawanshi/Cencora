import React from 'react';
import Header from '../Components/Header';
import ContactList from '../Components/ContactList';

const HomePage: React.FC = () => {
  return (
    <div>
      <Header />
      <ContactList />
    </div>
  );
};

export default HomePage;
