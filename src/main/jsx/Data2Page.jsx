import '../webapp/css/custom.css';
 
import React from 'react';
import axios from 'axios';
class Data2Page extends React.Component {
 
  render() {

    let dataResult;
    axios.get('/userData', {
      params: {
        bno: 1
      }
    }).then(function (response) {
      dataResult = response.data;
      console.log('data[axios22]:', dataResult);
    }).catch(function (error) {
      console.log(error);
    });

    return <p>{dataResult}</p>;
  }
}
export default Data2Page;
