import React, { Component } from 'react';
import { render } from 'react-dom';
import Hello from './Hello';
import './style.css';

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = ({ deps: [] })
  };
  componentDidMount() {
    fetch('http://jsonplaceholder.typicode.com/users')
      .then(res => res.json())
      .then((data) => {
        this.setState({ deps: data })
      })
      .catch(console.log)
  }

  render() {
    const DepsName = this.state.deps.map((item, i) =>
      <ol>
      <li>{item.id}
          <ol>
           <li>{item.employees.name}</li>
          </ol>
      </li>
      </ol>
    );

    return (
      <div className="App">
          {DepsName}
      </div>
    );
  }
}


render(<App />, document.getElementById('root'));
