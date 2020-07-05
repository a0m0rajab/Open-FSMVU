const initialState = { result: 0, prevValues: [] ,show:false};
const reducer = (state = initialState, action) => {
    switch (action.type) {
        case "ADD":
            state = {
                ...state,
                result: state.result + 1,
                prevValues: [...state.prevValues, state.result]
            }
            break;
            case "SHOW":
            state = {
                ...state,
               show:true
            }
            break;
    }
    return state;
}
export default reducer;