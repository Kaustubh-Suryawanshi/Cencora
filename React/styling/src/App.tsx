import React from 'react';
import './App.css';
import CSS_using_styled_comp from './Components/CSS_using_styled_comp';

const App: React.FC = () => {
  const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    console.log('Form submitted!');
  };

  return (
    <div>
      <CSS_using_styled_comp onSubmit={handleSubmit} />
    </div>
  );
};

export default App;
