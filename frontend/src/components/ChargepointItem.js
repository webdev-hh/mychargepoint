import styled from "styled-components/macro";

export default function ChargepointItem({ chargepoint }) {
  return (
    <Wrapper>
      <h2>{chargepoint.name}</h2>
      <div>
        <a href={chargepoint.url}>Detail Page</a>
      </div>
      <div>ID: {chargepoint.ge_id}</div>
      <div>
        {chargepoint.address.postcode} {chargepoint.address.city},{" "}
        {chargepoint.address.street}
      </div>
    </Wrapper>
  );
}

const Wrapper = styled.div`
  color: #e9edf1;
  flex: 1 1 250px;
  background: #9ba1a7;
  border: darkgrey 2px solid;
  border-radius: 6px;
  padding: 12px;
  margin: 12px;
  text-align: center;

  a:link {
    color: darkblue;
    text-decoration: none;
  }

  a:visited {
    color: darkviolet;
    text-decoration: none;
  }
`;
