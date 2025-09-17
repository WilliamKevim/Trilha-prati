// Skeleton.jsx - 01-css-global
const Skeleton = ({ width = '100%', height = '1em', style = {} }) => (
  <div
    className="skeleton"
    style={{ width, height, ...style, minHeight: height }}
    aria-hidden="true"
  />
);

export default Skeleton;
