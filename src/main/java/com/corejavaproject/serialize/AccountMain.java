package com.corejavaproject.serialize;

import lombok.extern.log4j.Log4j2;


import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

@Log4j2
public class AccountMain {

    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {

        String filename = "/resources/filetext1.txt";
        URL resourceUrl = AccountMain.class.getResource(filename);
        //File file = Paths.get(resourceUrl.toURI()).toFile();
        File file = new File(AccountMain.class.getClassLoader().getResource("filetext1.txt").getFile());
        Account account1 = new Account();
        account1.setAccountID(76349739);
        account1.setAccountName("Prabhu");
        account1.setAccountAddress("California");

        AccountMain accountMain = new AccountMain();

        accountMain.serialize(account1, filename, file);

        Account account3 = accountMain.deserialize(filename, file);

        log.info(account3);


    }

    public void serialize(Account account, String filename, File file) throws FileNotFoundException {

        try (ObjectOutputStream OutStream = new ObjectOutputStream(new FileOutputStream(file))) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Account deserialize(String filename, File file) throws FileNotFoundException {
        Account account = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            account = (Account) inputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return account;
    }
}
