/*
 * This file is generated by jOOQ.
*/
package ch.uzh.sprachenzentrum.kursadmin.database.or.sys.tables;


import ch.uzh.sprachenzentrum.kursadmin.database.or.sys.Sys;
import ch.uzh.sprachenzentrum.kursadmin.database.or.sys.tables.records.SysstatisticsRecord;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sysstatistics extends TableImpl<SysstatisticsRecord> {

    private static final long serialVersionUID = 1700141988;

    /**
     * The reference instance of <code>SYS.SYSSTATISTICS</code>
     */
    public static final Sysstatistics SYSSTATISTICS = new Sysstatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysstatisticsRecord> getRecordType() {
        return SysstatisticsRecord.class;
    }

    /**
     * The column <code>SYS.SYSSTATISTICS.STATID</code>.
     */
    public final TableField<SysstatisticsRecord, String> STATID = createField("STATID", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSSTATISTICS.REFERENCEID</code>.
     */
    public final TableField<SysstatisticsRecord, String> REFERENCEID = createField("REFERENCEID", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSSTATISTICS.TABLEID</code>.
     */
    public final TableField<SysstatisticsRecord, String> TABLEID = createField("TABLEID", org.jooq.impl.SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSSTATISTICS.CREATIONTIMESTAMP</code>.
     */
    public final TableField<SysstatisticsRecord, Timestamp> CREATIONTIMESTAMP = createField("CREATIONTIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>SYS.SYSSTATISTICS.TYPE</code>.
     */
    public final TableField<SysstatisticsRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.CHAR(1).nullable(false), this, "");

    /**
     * The column <code>SYS.SYSSTATISTICS.VALID</code>.
     */
    public final TableField<SysstatisticsRecord, Boolean> VALID = createField("VALID", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>SYS.SYSSTATISTICS.COLCOUNT</code>.
     */
    public final TableField<SysstatisticsRecord, Integer> COLCOUNT = createField("COLCOUNT", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<SysstatisticsRecord, Object> STATISTICS = createField("STATISTICS", org.jooq.impl.DefaultDataType.getDefaultDataType("org.apache.derby.catalog.Statistics"), this, "");

    /**
     * Create a <code>SYS.SYSSTATISTICS</code> table reference
     */
    public Sysstatistics() {
        this(DSL.name("SYSSTATISTICS"), null);
    }

    /**
     * Create an aliased <code>SYS.SYSSTATISTICS</code> table reference
     */
    public Sysstatistics(String alias) {
        this(DSL.name(alias), SYSSTATISTICS);
    }

    /**
     * Create an aliased <code>SYS.SYSSTATISTICS</code> table reference
     */
    public Sysstatistics(Name alias) {
        this(alias, SYSSTATISTICS);
    }

    private Sysstatistics(Name alias, Table<SysstatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sysstatistics(Name alias, Table<SysstatisticsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sysstatistics as(String alias) {
        return new Sysstatistics(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sysstatistics as(Name alias) {
        return new Sysstatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sysstatistics rename(String name) {
        return new Sysstatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sysstatistics rename(Name name) {
        return new Sysstatistics(name, null);
    }
}