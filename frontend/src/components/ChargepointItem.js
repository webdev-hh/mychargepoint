import styled from "styled-components/macro";

export default function ChargepointItem({ chargepoint }) {
  return (
    <Wrapper>
      <h2>{chargepoint.name}</h2>
      <div>{chargepoint.ge_id}</div>
      <div>
        {chargepoint.address.postcode} {chargepoint.address.city},{" "}
        {chargepoint.address.street}
      </div>
    </Wrapper>
  );
}

const Wrapper = styled.div`
  color: #939ea9;
  flex: 1 1 250px;
  background: #373e46;
  border: darkgrey 2px solid;
  border-radius: 6px;
  padding: 12px;
  margin: 12px;
  text-align: center;

  a:link {
    color: #3770c2;
    text-decoration: none;
  }

  a:visited {
    color: #4b7ab6;
    text-decoration: none;
  }
`;
