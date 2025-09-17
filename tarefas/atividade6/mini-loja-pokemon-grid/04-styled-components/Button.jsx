// Button.jsx - 04-styled-components
export default function Button({ children, variant="solid", disabled=false }) {
  return (
    <button disabled={disabled} className={`btn btn-${variant}`}>
      {children}
    </button>
  );
}
