import React, { useEffect, useState } from 'react';
import Navbar from './Navbar';
import ProductCard from './ProductCard';
import { products } from './products';
import './styles.css';

const SKELETON_DELAY = 1200;

function App() {
  const [theme, setTheme] = useState(() => localStorage.getItem('theme') || 'light');
  const [cart, setCart] = useState([]);
  const [loadingIds, setLoadingIds] = useState([]);

  useEffect(() => {
    document.body.className = theme === 'dark' ? 'dark' : '';
    localStorage.setItem('theme', theme);
  }, [theme]);

  const handleToggleTheme = () => {
    setTheme(theme === 'dark' ? 'light' : 'dark');
  };

  const handleAddToCart = (id) => {
    setLoadingIds((prev) => [...prev, id]);
    setTimeout(() => {
      setCart((prev) => [...prev, id]);
      setLoadingIds((prev) => prev.filter((itemId) => itemId !== id));
    }, SKELETON_DELAY);
  };

  return (
    <>
      <Navbar
        theme={theme}
        onToggleTheme={handleToggleTheme}
        cartCount={cart.length}
      />
      <main>
        <section className="products-grid" aria-label="Produtos">
          {products.map((product) => (
            <ProductCard
              key={product.id}
              product={product}
              loading={loadingIds.includes(product.id)}
              onAdd={() => handleAddToCart(product.id)}
            />
          ))}
        </section>
      </main>
    </>
  );
}

export default App;
