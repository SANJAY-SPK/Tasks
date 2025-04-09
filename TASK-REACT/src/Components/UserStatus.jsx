const UserStatus = ({ name, isOnline, age}) => {
  return (
    <div id="user-status">
        <h2>Name: {name}</h2>
        <h3>Status: {isOnline?"Online":"Offline"}</h3>
        <h3>Age: {age >= 18 ? "Adult" : "Minor"}</h3>
    </div>
  );
}

export default UserStatus;
