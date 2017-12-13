# Instalasi
	1. Buat Database Baru mysql : bankmegaspring 
	2. Run Program 2x
	3. Lihat Service package
	4. Ganti MODE UPDATE jika sudah terinstalasi dengan benar (ApplicationContext.xml).
	5. NON Aktivkan INIT class InitDB ketika mode UPDATE
	6. Username and Password Login
	
### Buat Database Baru 
	contoh: bankmegaspring	

### Run Program 2x karena :
	1. Mode Hibernate ddl auto adalah CREATE
	2. masih error ketika jika hiberante tidak menemukan table yang akan di drop.

### Lihat Service package 
	terdapat class iniDB pada service komponent utama untuk USER LOGIN
	ini berfungsi untuk menginsert data login untuk pertama kali (HIBERNATE MODE CREATE)
	
### Ganti MODE UPDATE jika sudah terinstalasi dengan benar (ApplicationContext.xml).

###	NON Aktivkan INIT class InitDB ketika mode UPDATE 
	NON Aktivkan INIT class InitDB agar tidak terjadi duplicate key dengan marker comment, seperti berikut :
	@PostConstruct
	public void init(){
		//Role roleAdmin = new Role();
		//roleAdmin.setRoleName("ROLE_ADMIN");
		//Role roleStaff = new Role();
		//roleStaff.setRoleName("ROLE_STAFF");
		//Role roleOpera = new Role();
		//roleOpera.setRoleName("root");
		dst...
	}

### Username and Password Login
	* username : root@bankmega.com
	* password : 12345