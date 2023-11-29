contacts = []

def add_contact():
    name = input("Enter contact name: ")
    phone = input("Enter phone number: ")
    email = input("Enter email address: ")
    address = input("Enter address: ")
    
    contact = {'name': name,'phone': phone, 'email': email,'address': address}
    contacts.append(contact)
    print(f"Contact added successfully")

def view_contact_list():
    if not contacts:
        print("Contact list is empty")
    else:
        print("\nContact List:")
        for contact in contacts:
            print(f"Name: {contact['name']}, Phone: {contact['phone']}")

def search_contact():
    keyword = input("Enter name or phone number to search: ")
    results = [contact for contact in contacts if keyword.lower() in contact['name'].lower() or keyword in contact['phone']]
    if results:
        print("\nSearch Results:")
        for result in results:
            print(f"Name: {result['name']}, Phone: {result['phone']}")
    else:
        print("No contacts found")

def update_contact():
    name = input("Enter the name of the contact to update:")
    
    for contact in contacts:
        if contact['name'].lower() == name.lower():
            print("\nUpdate Contact:")
            print(f"1. Name: {contact['name']}")
            print(f"2. Phone: {contact['phone']}")
            print(f"3. Email: {contact['email']}")
            print(f"4. Address: {contact['address']}")
            
            field = input("Select the field to update (1-4):")
            
            if field in ['1', '2', '3', '4']:
                new_value = input(f"Enter the new value for {['Name', 'Phone', 'Email', 'Address'][int(field) - 1]}: ")
                contact[list(contact.keys())[int(field) - 1]] = new_value
                print("Contact updated successfully.")
                return
            else:
                print("Invalid choice. Update canceled.")
                return
    
    print(f"No contact found with the name {name}.")

def delete_contact():
    name = input("Enter the name of the contact to delete: ")
    
    for contact in contacts:
        if contact['name'].lower() == name.lower():
            contacts.remove(contact)
            print("Contact deleted successfully.")
            return
    
    print(f"No contact found with the name {name}.")

while True:
    print("\nContact Book Menu:")
    print("1. Add Contact")
    print("2. View Contact List")
    print("3. Search Contact")
    print("4. Update Contact")
    print("5. Delete Contact")
    print("6. Exit")
    
    choice = input("Enter your choice (1-6): ")
    
    if choice == '1':
        add_contact()
    elif choice == '2':
        view_contact_list()
    elif choice == '3':
        search_contact()
    elif choice == '4':
        update_contact()
    elif choice == '5':
        delete_contact()
    elif choice == '6':
        print("Exiting Contact Book. Goodbye!")
        break
    else:
        print("Invalid choice. Please enter a number from 1 to 6.")
