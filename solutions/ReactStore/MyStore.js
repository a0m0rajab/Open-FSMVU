import {createStore} from "redux";
import reducer from "./reducers/MyReducer";

const  store=createStore(reducer);
export default store;