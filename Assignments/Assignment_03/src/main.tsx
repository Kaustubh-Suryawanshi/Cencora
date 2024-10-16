import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import {BrowserRouter } from 'react-router-dom';
import { ContactsProvider } from './Context/ContactContext';
import './style.css';

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
  <React.StrictMode>
    <ContactsProvider>
      <BrowserRouter>
        <App />
      </BrowserRouter>
    </ContactsProvider>
  </React.StrictMode>
);
