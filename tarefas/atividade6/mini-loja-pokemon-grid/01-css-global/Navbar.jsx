import React from 'react';

const Navbar = ({ theme, onToggleTheme, cartCount }) => {
  return (
    <nav className="navbar" aria-label="Barra de navegação">
      <div className="navbar__logo">Mini Loja Pokémon</div>
      <button
        className="navbar__theme-toggle"
        aria-label="Alternar tema"
        onClick={onToggleTheme}
      >
        {theme === 'dark' ? '🌙' : '☀️'}
      </button>
      <div className="navbar__cart" aria-label="Carrinho">
        <span className="navbar__cart-badge" aria-label="Itens no carrinho">{cartCount}</span>
        🛒
      </div>
    </nav>
  );
};

export default Navbar;
