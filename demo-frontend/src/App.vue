<template>
  <div id="app">
    <el-upload class="upload-demo"
               action="/api/upload"
               multiple
               :limit="1"
               :on-success="success">
      <el-button size="small"
                 type="primary">点击上传</el-button>
    </el-upload>
    <video v-if="mediaSrc!==''"
           width="320"
           height="240"
           controls>
      <source :src="mediaSrc"
              type="video/mp4">
      您的浏览器不支持 video 标签。
    </video>
  </div>
</template>

<script>
// 后台请求的地址接口地址 
import { mediaURL } from '@/config/base.config';
export default {
  data() {
    return {
      fileList: [],
      mediaSrc: '',
    };
  },
  methods: {
    success(res) {
      this.mediaSrc = mediaURL + res;
    },
  },
};
</script>

<style lang="less">
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
