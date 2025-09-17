// ProductCard.jsx - 04-styled-components
export default function ProductCard({ produto }) {
  return (
    <div className="product-card">
      <img src={produto.imagem} alt={produto.titulo} loading="lazy" width="300" height="300" />
      <h3>{produto.titulo}</h3>
      <p>{produto.preco}</p>
      <p>⭐ {produto.rating}</p>
      <span>{produto.tag}</span>
      <button>Adicionar</button>
    </div>
  );
}
