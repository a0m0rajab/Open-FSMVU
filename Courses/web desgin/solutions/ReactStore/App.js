import React from 'react';
import logo from './logo.svg';
import './App.css';
import { connect } from 'react-redux';

class App extends React.Component {
  render()
  {
    const showItems =this.state.prevValues.map((item, i) =>
    <ol>
    <li>{item}
    </li>
    </ol>
  );

    return (
    <div className="App">
    <h1>   { this.state.show ? {showItems} : '' } </h1> 
    <button onClick={this.props.inc}>Increase</button>
    <button onClick={this.props.show}>show</button>
    </div>
  );
  }
}

const mapStateToProps= (state)=>{
  return {
      localState:state
  };
};

const mapDispatchtoProps= (dispatch )=>{
  return {
          inc: () => {
            dispatch({type:"ADD"})},
          show:() => {
            dispatch({type:"show"}) 
          }   
  };
};

export default connect(mapStateToProps,mapDispatchtoProps)(App);


// https://medium.com/@aghh1504/2-increment-and-decrease-number-onclick-react-5767b765103c