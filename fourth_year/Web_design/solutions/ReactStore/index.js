import React from 'react';
import {Provider} from "react-redux";
import {createStore, applyMiddleware} from "redux";
import {render} from "react-dom"; 
import reducer from "./reducers/MyReducer";
import App from "./App.js";

const store =createStore(reducer);

render(<Provider store={store}>
       <App /> 
       </Provider>, 
        document.getElementById('root'));
