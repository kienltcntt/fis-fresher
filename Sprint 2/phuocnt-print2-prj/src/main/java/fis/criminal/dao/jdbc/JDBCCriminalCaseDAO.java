package fis.criminal.dao.jdbc;

import fis.criminal.dao.ICriminalCaseDAO;
import fis.criminal.model.CriminalCase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JDBCCriminalCaseDAO implements ICriminalCaseDAO {
    public final static String URL = "jdbc:mysql://localhost:3306/evidence_db";
    public final static String USER_NAME = "root";
    public final static String PASSWORD = "kien1234";

    private final static Logger logger = LoggerFactory.getLogger(JDBCCriminalCaseDAO.class);

    @Override
    public void delete(long id) {

    }

    @Override
    public void save(CriminalCase criminalCase) {

    }

    @Override
    public Optional<CriminalCase> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<CriminalCase> getAll() {
        List<CriminalCase> criminalCases = new ArrayList<>();
        try (Connection con =
                     DriverManager.getConnection (URL, USER_NAME, PASSWORD);
             PreparedStatement stmt = con.prepareStatement("SELECT * FROM criminal_case");
             ResultSet rs = stmt.executeQuery ()) {

            while (rs.next()) {
                CriminalCase criminalCase = CriminalCaseMapper.get(rs);
                if(criminalCase != null)
                    criminalCases.add(criminalCase);
                System.out.println(criminalCase);
            } // end of while
        } catch (SQLException e) {
            logger.error(e.toString());
        } // end of try-with-resources
        return criminalCases;
    }

    @Override
    public void update(CriminalCase criminalCase) {

    }

    @Override
    public void delete(CriminalCase criminalCase) {

    }
}
