const initialState = {
    todos: []
}

const todoReducer = (state = initialState, action) => {
    switch (action.type) {
        case 'ADD':
            return {
                ...state, todos: [...state.todos, { id: action.id, text: action.text }]
            }
        case 'REMOVE':
            return {
                ...state, todos: state.todos.filter(todo => todo.id !== action.id)
            }
        default:
            return state;
    }
}

export default todoReducer