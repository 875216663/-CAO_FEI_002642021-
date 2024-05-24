import { MESSAGES } from "../../constants";

function Error({ error }) {
  return <p>{MESSAGES[error] || MESSAGES.default}</p>;
}

export default Error;
