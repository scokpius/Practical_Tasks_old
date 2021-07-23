public class Room {
        private Guest[] guests;

        public Room() {
                this.guests = new Guest[10];
        }

        public Guest[] getGuests() {
                return guests;
        }

        public void setGuests(Guest[] guests) {
                for (int i = 0; i < this.guests.length; i++) {
                        this.guests[i] = guests[i];
                }
        }
         public Guest[] addGuest(Guest guest){
                 for (int i = 0; i < guests.length; i++) {
                         if (guests[i] == null){
                              guests[i] = guest;
                         }
                        // if () // дописать увеличение массива
                 }


           return this.guests;
         }
}
