// Navbar.jsx - 02-css-modules
export default function Navbar() {
  return (
    <nav className="navbar">
      <span>Mini Loja Pokémon</span>
      <button aria-label="Alternar tema">🌙</button>
      <span aria-label="Itens no carrinho">🛒 0</span>
    </nav>
  );
}
