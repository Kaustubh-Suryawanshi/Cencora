import React from 'react';
import { Link } from 'react-router-dom';

const Header: React.FC = () => {
  return (
    <header className="header">
      <h1>Contact Manager</h1>
      <Link to="/contact">
        <button className="add-contact-button">Add Contact</button>
      </Link>
    </header>
  );
};

export default Header;
