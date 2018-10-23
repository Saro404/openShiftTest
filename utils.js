const path = require('path');
const _root = path.resolve(__dirname);

module.exports = {
  root
};

function root(args) {
  args = Array.prototype.slice.call(arguments, 0);
  return path.join.apply(path, [_root].concat(args));
}
