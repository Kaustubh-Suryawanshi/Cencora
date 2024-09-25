import React from 'react'

import { styled } from 'styled-components';

const FormContainer = styled.form`
  display: flex;
  flex-direction: column;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
`;

const Label = styled.label`
  margin-bottom: 10px;
`;

const Input = styled.input`
  padding: 10px;
  margin-bottom: 20px;
  border: 1px solid #ccc;
`;

const Button = styled.button`
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  background-color: #4CAF50;
  color: #fff;
  cursor: pointer;
`;

interface FormProps {
  onSubmit: (event: React.FormEvent<HTMLFormElement>) => void;
}

const CSS_using_styled_comp: React.FC<FormProps> = ({ onSubmit }) => {
  return (
    <FormContainer onSubmit={onSubmit}>
      <Label>Username:</Label>
      <Input type="text" />
      <Label>Password:</Label>
      <Input type="password" />
      <Button type="submit">Login</Button>
    </FormContainer>
  );
};

export default CSS_using_styled_comp
