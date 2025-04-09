function TodayDate() {
    const today = new Date();
    return <p>Today's date is: {today.toDateString()}</p>;
  }

  export default TodayDate;