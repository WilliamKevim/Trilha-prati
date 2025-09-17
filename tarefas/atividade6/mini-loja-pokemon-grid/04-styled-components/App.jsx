// App.jsx - 04-styled-components
import Navbar from './Navbar';
import ProductCard from './ProductCard';

const produtos = [{'id': 1, 'titulo': 'Poção Curativa', 'preco': 'R$ 20,00', 'rating': 4.5, 'tag': 'Novo', 'imagem': 'https://via.placeholder.com/300?text=Pocao'}, {'id': 2, 'titulo': 'Pokébola', 'preco': 'R$ 50,00', 'rating': 4.7, 'tag': 'Promo', 'imagem': 'https://via.placeholder.com/300?text=Pokebola'}, {'id': 3, 'titulo': 'Super Poção', 'preco': 'R$ 80,00', 'rating': 4.3, 'tag': 'Novo', 'imagem': 'https://via.placeholder.com/300?text=Super+Pocao'}, {'id': 4, 'titulo': 'Revive', 'preco': 'R$ 120,00', 'rating': 4.8, 'tag': 'Novo', 'imagem': 'https://via.placeholder.com/300?text=Revive'}, {'id': 5, 'titulo': 'Incenso Místico', 'preco': 'R$ 150,00', 'rating': 4.2, 'tag': 'Promo', 'imagem': 'https://via.placeholder.com/300?text=Incenso'}, {'id': 6, 'titulo': 'Ultra Bola', 'preco': 'R$ 200,00', 'rating': 4.9, 'tag': 'Novo', 'imagem': 'https://via.placeholder.com/300?text=Ultra+Bola'}];

export default function App() {
  return (
    <div className="app">
      <Navbar />
      <main className="grid-container">
        {produtos.map((p) => (
          <ProductCard key={p.id} produto={p} />
        ))}
      </main>
    </div>
  );
}
