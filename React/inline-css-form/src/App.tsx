import React from "react";
import Form from "./Form";

const App: React.FC = () => {
  const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    console.log("Form submitted!");
  };

  return (
    <div>
      <Form onSubmit={handleSubmit} />
    </div>
  );
};

export default App;
