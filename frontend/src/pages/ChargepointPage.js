import styled from "styled-components/macro";
import ChargepointItem from "../components/ChargepointItem";
import UseChargepoints from "../hooks/UseChargepoints";

export default function ChargepointPage() {
  const { chargepoints } = UseChargepoints();

  console.log(chargepoints); // Output on console for testing

  return (
    <Wrapper>
      {chargepoints.map((chargepoint) => (
        <ChargepointItem key={chargepoint.id} chargepoint={chargepoint} />
      ))}
    </Wrapper>
  );
}

const Wrapper = styled.div`
  ul {
    padding: 2px;
  }
  li {
    padding: 2px;
    background-color: aqua;
    border: black solid 1px;
  }
`;
