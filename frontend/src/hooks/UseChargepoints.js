import axios from "axios";
import { useEffect, useState } from "react";

export default function UseChargepoints() {
  const [chargepoints, setChargepoints] = useState([]);
  useEffect(() => {
    axios
      .get("data.json")
      .then((response) => response.data.chargelocations)
      .then((data) => {
        setChargepoints(data);
      })
      .catch((error) => console.log(error));
  }, []);

  return { chargepoints };
}
