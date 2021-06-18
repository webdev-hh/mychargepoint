import React, { Component } from "react";
import "./App.css";
// import UseChargepoints from "./hooks/UseChargepoints";
import ChargepointPage from "./pages/ChargepointPage";

class App extends Component {
  render() {
    return (
      <div className="App">
        <div className="App-header">
          <h2>MyChargepoint</h2>
          {/*<UseChargepoints />*/}
          <ChargepointPage />
        </div>
      </div>
    );
  }
}

export default App;
