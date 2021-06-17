import axios from "axios";
import { useEffect, useState } from "react";

export default function ChargepointList() {
  const [chargepoints, setChargepoints] = useState([]);
  useEffect(() => {
    axios
      .get("data.json")
      .then((response) => response.data)
      .then((data) => {
        setChargepoints(data);
      })
      .catch((error) => console.log(error));
  }, []);
  console.log(chargepoints);
  return <div>List</div>;
}
