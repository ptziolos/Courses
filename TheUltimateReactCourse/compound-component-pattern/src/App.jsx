import Counter from "./Counter";
import "./styles.css";

export default function App() {
  return (
    <div>
      <h1>Compound Component Pattern</h1>
      {/* <Counter
        iconIncrease="+"
        iconDecrease="-"
        label="My NOT so flexible counter"
        hideLabel={false}
        hideIncrease={false}
        hideDecrease={false}
      /> */}

      <Counter>
        <Counter.Label>My super flexible counter</Counter.Label>
        <Counter.Increase icon="+" />
        <Counter.Decrease icon="-" />
        <Counter.Count />
      </Counter>

      <div>
        <Counter>
          <div>
            <Counter.Label>Horizontal</Counter.Label>
          </div>
          <Counter.Decrease icon="◀️" />
          <Counter.Count />
          <Counter.Increase icon="▶️" />
        </Counter>
      </div>

      <div>
        <Counter>
          <div>
            <Counter.Label>Vertical</Counter.Label>
          </div>
          <Counter.Decrease icon="◀️" />
          <div>
            <Counter.Count />
          </div>
          <Counter.Increase icon="▶️" />
        </Counter>
      </div>
    </div>
  );
}
