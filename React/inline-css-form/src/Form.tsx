import React from "react";

interface FormProps {
  onSubmit: (event: React.FormEvent<HTMLFormElement>) => void;
}

const Form: React.FC<FormProps> = ({ onSubmit }) => {
  return (
    <div>
      <form
        style={{
          display: "flex",
          alignItems: "center",
          flexDirection: "column",
          padding: 20,
          border: "1px solid #ccc",
          borderRadius: 5,
          boxShadow: "0 0 10px rgba(0, 0, 0, 0.1)",
        }}
        onSubmit={onSubmit}
      >
        <label
          style={{
            marginBottom: 10,
          }}
        >
          Username:
        </label>
        <input
          style={{
            padding: 10,
            marginBottom: 20,
            border: "1px solid #ccc",
            width: "200px",
            alignContent: "center",
          }}
          type="text"
        />
        <label
          style={{
            marginBottom: 10,
          }}
        >
          Password:
        </label>
        <input
          style={{
            padding: 10,
            marginBottom: 20,
            border: "1px solid #ccc",
            width: "200px",
          }}
          type="password"
        />
        <button
          style={{
            padding: 10,
            border: "none",
            borderRadius: 5,
            backgroundColor: "#4CAF50",
            color: "#fff",
            cursor: "pointer",
          }}
          type="submit"
        >
          Login
        </button>
      </form>
    </div>
  );
};

export default Form;
