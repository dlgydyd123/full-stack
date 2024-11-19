export const add = (id,name) =>({
    type : 'ADD_TO_CART',
    id,
    name
})

export const remove = (id) =>({
    type : 'REMOVE_FROM_CART',
    id
})