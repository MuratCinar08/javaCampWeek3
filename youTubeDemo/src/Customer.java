public class Customer {
        public Customer() {
            System.out.println("Customer nesnesi üretildi");
        }
        public int Id;
        public String City;

        public int getId () {
            return Id;
        }

        public void setId(int id) {
            this.Id = id;
    }

        public String getCity () {
            return City;
    }

        public void setCity(String city) {
            this.City = city;
    }
}
