public class Room {
        private Guest guests[];

        public Guest[] getGuests() {
                return guests;
        }

        public void setGuests(Guest[] guests) {
                for (int i = 0; i < this.guests.length; i++) {
                        this.guests[i] = guests[i];
                }
        }

}
