import React, { Component } from "react";
import "./App.css";
import ChargepointList from "./pages/ChargepointList";

class App extends Component {
  render() {
    return (
      <div className="App">
        <div className="App-header">
          <h2>MyChargepoint</h2>
          <ChargepointList />
        </div>
      </div>
    );
  }
}

export default App;
