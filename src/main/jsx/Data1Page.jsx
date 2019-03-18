import '../webapp/css/custom.css';
 
import React from 'react';
import ReactDOM from 'react-dom';
import axios from 'axios'; 

class Data1Page extends React.Component {
   
    /*
    cconstructor() {
      //this.state = { dataResult: null };
    }
    
    componentWillMount() {
      console.log('componentWillMount');
      axios.get('/userData', {
          params: {
            bno: 1
          }
        }).then(function (response) {
          //console.log(response);
          dataResult.listItems = response.data;
          //dataResult = <p>response.data</p>;
          
          //data = data.replace("\r\n",'');
          console.log('data[axios]:',dataResult);
        }).catch(function (error) {
          console.log(error);
        });
    }
    */

    render() {

        const data =[{"name":"test1"},{"name":"test2"}];
        const listItems = data.map((d) => <li key={d.name}>{d.name}</li>);
        
        //console.log(dataResult);
        console.log(<Data2Page/>);
        /*
        if(this.state.dataResult.length > 0 ){
          console.log("test1::"+this.state.dataResult);
        
          //const content = "Hey my number is 555:555:5555.";
          //console.log("content:"+content);
          const result = this.state.dataResult.split(':').map(t => {
            return <p>{t}</p>;
          });
          console.log("result:"+result);
        }
        */
        
        return <div className="page1">REPLY 데이터 페이지
        <p>{listItems}</p>
        <p>data1</p>
        <Data2Page/>
        </div>;
    }
}

class Data2Page extends React.Component {

  constructor(props) {
    super(props);

    this.state = {
       header: "Header Initial state",
       content: "Content Initial State"
   };

    this.prop = {
      one : "one.."
   }

   this.onChg2 = this.onChg2.bind(this);
  }

  componentWillMount(){
    this.onChg();
  }

  onChg() {
    let dataResult;
    axios.get('/userData', {
      params: {
        bno: 1
      }
    }).then(response =>{
      this.setState({
        header : response.data
      });
    }).catch(error => {
      console.log(error);
    });
    
  }

  onChg2(){
    this.setState({
      header : "CNAGED.."
    });
  }

  render() {

    const{ header, content } = this.state;
    console.log({header});
    console.log({content});
    /*
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
    */
    
    return <p onClick={this.onChg2}>{header}</p>;
  }
}

ReactDOM.render(<Data1Page/>, document.getElementById('root'));