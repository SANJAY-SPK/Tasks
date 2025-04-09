const Message = ({ message }) => {
  return (
    <div className="message">
      <h3>Notifcation: {message? message :"No notifications occured"}</h3>
    </div>
  );
};

export default Message;