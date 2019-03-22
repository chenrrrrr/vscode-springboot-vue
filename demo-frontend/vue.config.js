module.exports = {
  devServer: {
    port: 9090,
    proxy: {
      '/api': {
        target: 'http://localhost:8080', // 将主机标头的原点更改为目标URL
        changeOrigin: true,
        pathRewrite: { '^/api': '' },
      },
    },
  },
};
