import React from 'react';
import Button from './Button';
import Skeleton from './Skeleton';

const ProductCard = ({ product, onAdd, loading }) => {
  return (
    <div
      className={`product-card${loading ? ' product-card--loading' : ''}`}
      aria-label={product.title}
      aria-disabled={loading}
    >
      <div className="product-card__image-wrapper">
        {loading ? (
          <Skeleton width="80%" height="80%" style={{ margin: 'auto' }} />
        ) : (
          <img
            src={product.image}
            alt={product.title}
            loading="lazy"
            className="product-card__image"
          />
        )}
        {product.tag && !loading && (
          <span className="product-card__tag" style={{ marginRight: 4 }}>{product.tag}</span>
        )}
      </div>
      <div className="product-card__info">
        <h2 className="product-card__title" title={product.title}>
          {loading ? <Skeleton width="80%" height="1.2em" /> : product.title}
        </h2>
        <div className="product-card__price">
          {loading ? <Skeleton width="60%" height="1em" /> : `R$ ${product.price.toFixed(2)}`}
        </div>
        <div className="product-card__rating" aria-label={`Nota ${product.rating}`}>
          {loading ? <Skeleton width="40%" height="1em" /> : '★'.repeat(Math.round(product.rating))}
        </div>
        <Button
          variant="solid"
          onClick={onAdd}
          disabled={loading}
          aria-busy={loading}
        >
          {loading ? 'Adicionando...' : 'Adicionar'}
        </Button>
      </div>
    </div>
  );
};

export default ProductCard;
