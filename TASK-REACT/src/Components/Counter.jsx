import React from 'react'

const Counter = () => {

    const [count, setCount] = React.useState(0)
    const increment = () => setCount(count + 1)
    const decrement = () => setCount(count - 1)
    const reset = () => setCount(0)

  return (
    <div>
        <p>Count: {count}</p>
        <button onClick={increment}>Increment</button>
        <button onClick={decrement}>Decrement</button>
        <button onClick={reset}>Reset</button>
        <p>{count > 0 ? "Positive" : count < 0 ? "Negative" : "Zero"}</p>
        <p>{count % 2 === 0 ? "Even" : "Odd"}</p>
        <p>{count > 10 ? "Greater than 10" : count < -10 ? "Less than -10" : "Between -10 and 10"}</p>
    </div>
  )
}

export default Counter