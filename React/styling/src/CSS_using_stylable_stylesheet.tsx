import React from 'react';
import {st} from '@stylable/runtime'
import {styles} from './CSS_using_stylable_stylesheet.st.css';

interface FormProps {
  onSubmit: (event: React.FormEvent<HTMLFormElement>) => void;
}

const CSS_using_stylable_stylesheet: React.FC<FormProps> = ({ onSubmit }) => {
  return (
    <form className={styles.root} onSubmit={onSubmit}>
      <label className={styles.label}>Username:</label>
      <input className={styles.input} type="text" />
      <label className={styles.label}>Password:</label>
      <input className={styles.input} type="password" />
      <button className={styles.button} type="submit">Login</button>
    </form>
  );
};

export default CSS_using_stylable_stylesheet;