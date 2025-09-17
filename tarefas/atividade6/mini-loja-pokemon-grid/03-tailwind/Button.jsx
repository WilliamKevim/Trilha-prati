// Button.jsx - 03-tailwind
export default function Button({ children, variant="solid", disabled=false }) {
  return (
    <button disabled={disabled} className={`btn btn-${variant}`}>
      {children}
    </button>
  );
}
