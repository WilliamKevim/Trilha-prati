import React from 'react';

const Button = ({ children, variant = 'solid', ...props }) => {
  return (
    <button
      className={`btn btn--${variant}`}
      {...props}
      aria-disabled={props.disabled}
    >
      {children}
    </button>
  );
};

export default Button;
