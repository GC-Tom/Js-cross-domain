<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h2>{{ author }}</h2>
    <ul v-for="music in musics">
      <li>
        {{ music.name }}
      </li><br>
      <li>
        <img :src="music.album.picUrl" style="width:200px;">
      </li>
    </ul>
  </div>
</template>

<script>
const API_PROXY = 'http://192.168.23.207:8080/hello'
// const API_PROXY = 'http://192.168.0.41:8280/api/list.htm'
import axios from 'axios'
export default {
  name: 'hello',
  data () {
    return {
      msg: 'vue调用网易云接口',
      author: '泥猴啊',
      //musics: []
    }
  },
  mounted: function () {  
    // axios.get(API_PROXY + 'http://music.163.com/api/playlist/detail?id=19723756')
    axios.get(API_PROXY)
    .then(function (res) {

      alert(res.data)
    }).catch(function (error) {
      console.log(error)
    })
  }
}
</script>